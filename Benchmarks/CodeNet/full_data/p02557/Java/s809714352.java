import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a=new int[N];
        int[] b=new int[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<N; i++){
            b[i]=sc.nextInt();
        }
        int[] kazuA=new int[N];
        int[] kazuB=new int[N];

        int countA=0;
        int countB=0;
        
        for(int i=0; i<N; i++){
            int ch=0;
            boolean A=true;
            boolean B=true;
            while(A||B){
                if(countA<N && a[countA]==i+1){
                    ch++;
                    countA++;
                }else{
                    A = false;
                }

                if(countB<N && b[countB]==i+1){
                    ch++;
                    countB++;
                }else{
                    B = false;
                }
            }
            if(N<ch){
                System.out.println("No");
                return;
            }
            
            
        }
        
        


        String res = "";
        
        int p;
        int q=0;
        System.out.println("Yes");
        for(int i=0; i<N; i++){
            if(a[i]==b[N-i-1]){
                p = b[N-i-1];
                b[N-i-1] = b[0+q];
                b[0+q] = p;
                q++;
                i--;
                continue;
            }else{
                res = res + b[N-i-1] + " ";
            }
                q = 0;
        }

        System.out.println(res.trim());
        }
    }