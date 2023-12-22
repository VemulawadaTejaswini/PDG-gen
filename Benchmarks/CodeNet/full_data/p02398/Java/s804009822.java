import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int ans=0;
	for(int i=a;i<=b;i++)if(c%i==0)ans++;
	System.out.println(ans);
    }
    public static void main(String[]ag){
	new Main().main();
    }
}