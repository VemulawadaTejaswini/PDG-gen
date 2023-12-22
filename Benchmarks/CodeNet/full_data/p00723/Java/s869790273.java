import java.util.*;
class Main{
    int d[]={0,-1};
    void run(){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int attend=0;attend<n;attend++){
	    String str=sc.next();
	    HashSet<String> hashSet=new HashSet<String>();
	    for(int i=1;i<str.length();i++){
		//System.out.println("yahoo!");
		String[] div=new String[4];
		div[0]=str.substring(0,i);
		div[1]=(new StringBuffer(div[0])).reverse().toString();
		div[2]=str.substring(i,str.length());
		div[3]=(new StringBuffer(div[2])).reverse().toString();
		for(int j=0;j<4;j++){
		    for(int k=0;k<2;k++){
			hashSet.add(div[j]+div[(j+2+k+d[j%2])%4]);
		    }
		}
	    }
	    System.out.println(hashSet.size());
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}
//imitated