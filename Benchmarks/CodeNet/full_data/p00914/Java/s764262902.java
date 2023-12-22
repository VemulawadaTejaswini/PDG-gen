import java.util.*;
public class Main{
    public static boolean[] num;
	public static int n,k,s;
    public static int check(int a,int b,int c){
        if(b<0){
            return 0;
        }
        else if(a==1){
            if(b<=n){
                if(num[b]==true&&b>c){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else{
                return 0;
            }
        }
        else{
            int tmp=0;
            for(int i=1;i<=n;i++){
                if(num[i]==true&&i>c){
                    num[i]=false;
                    tmp+=check(a-1,b-i,i);
                    num[i]=true;
                }
            }
            return tmp;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            n=sc.nextInt();
			k=sc.nextInt();
            s=sc.nextInt();
			if(n!=0||k!=0||s!=0){
				num=new boolean[n+1];
				for(int i=0;i<=n;i++){
					num[i]=true;
				}
				System.out.println(check(k,s,0));
			}
            else{
                break;
            }
        }
    }
}
