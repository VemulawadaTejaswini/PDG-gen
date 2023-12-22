import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	while(t-->0){
	    String line = sc.next();

	    int ans = calc(line.substring(0,line.length()-1));
	    System.out.println(ans);
	}
    }

    int calc(String line){

	String newLine = "";
	for(int i=0; i<line.length(); i++){
	    if(line.charAt(i)=='('){
		int idx = i;
		while(line.charAt(idx)!=')') idx++;
		newLine += calc(line.substring(i+1,idx));
		i = idx;
	    }else newLine += line.charAt(i);
	}

	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Character> list2 = new ArrayList<Character>();
	String tmp = "";
	for(int i=0; i<newLine.length(); i++){
	    char c = newLine.charAt(i);
	    if(c=='*' || c=='/' || c=='+' || c=='-'){
		list.add(Integer.parseInt(tmp));
		tmp = "";
		list2.add(c);
	    }else{
		tmp += c;
	    }
	}
	list.add(Integer.parseInt(tmp));

	//System.out.println(list.size()+" "+list2.size());

	for(int i=0; i<list2.size(); i++){
	    char c = list2.get(i);
	    if(c=='*' || c=='/'){
		int n1 = list.get(i);
		int n2 = list.get(i+1);
		if(c=='*'){
		    list.set(i, n1*n2);
		}else{
		    list.set(i, n1/n2);
		}
		list.remove(i+1);
		list2.remove(i);
		i--;
	    }
	}

	int ans = list.get(0);
	for(int i=0; i<list2.size(); i++){
	    char c = list2.get(i);
	    if(c=='+'){
		ans += list.get(i+1);
	    }else{
		ans -= list.get(i+1);
	    }
	}

	return ans;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}