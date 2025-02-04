import java.util.*;

class Main{

    String S;
    int I;
    ArrayList<Character> line;
    boolean end;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    S = sc.next();
	    I = sc.nextInt();
	    if(S.equals("0") && I==0)break;
	    line = new ArrayList<Character>();
	    end = false;
	    splitLine(S);

	    String ans = "";
	    if(I>=line.size())ans = "0";
	    else ans = String.valueOf(line.get(I));

	    System.out.println(ans);
	}
    }

    void splitLine(String s){
	if(end)return;

	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i)-'A'<=25 && s.charAt(i)-'A'>=0){
		int j = i+1;
		for(j=i+1; j<s.length(); j++){
		    if(!(s.charAt(j)-'A'<=25 && s.charAt(j)-'A'>=0))break;
		}
		addLine(s.substring(i,j));
		if(end)return;
		i = j-1;
	    }else{
		int iL = i;
		for(iL=i+1; iL<s.length(); iL++){
		    if(!(s.charAt(iL)<10 || s.charAt(iL)=='0'))break;
		}
		int num = 0;
		int j=iL;
		for(j=iL; j<s.length(); j++){
		    if(s.charAt(j)=='('){num++;}
		    if(s.charAt(j)==')')num--;
		    if(num==0)break;
		}
		int count = Integer.parseInt(s.substring(i,iL));
		String newS = "";
		if(iL==j){
		    newS = s.substring(iL,iL+1);
		}else{
		    newS = s.substring(iL+1,j);
		}
		while(count-->0)splitLine(newS);
		i = j;
	    }
	}
    }
    
    void addLine(String s){
	char[] c = s.toCharArray();
	for(int i=0; i<c.length; i++){
	    line.add(c[i]);
	    if(line.size()>I){end = true; return;}
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}