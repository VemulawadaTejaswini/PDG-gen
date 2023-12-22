import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int n = sc.nextInt();
        if(n==0){System.out.println(x);}
        else{
		int [] in = new int [n];
       
        for(int i=0;i<n;i++){
                             in[i] = sc.nextInt()-x;
                            }
        Arrays.sort(in);
		int ans = x;
        int b = 0; 
        int point = 0;
        while(b==0){for(int i=0;i<n;i++){if(in[i]==point){}
                            else{if(i==n-1){b=1;ans+=point;}
                                }
                                        if(point==0){point=-1;}
                                        else{if(point<0){point*=-1;}
                                            else{point*=-1;
                                                point--;}
                                            }
                                        }
                   
                   }
		System.out.println(ans);
        }
	}
}
