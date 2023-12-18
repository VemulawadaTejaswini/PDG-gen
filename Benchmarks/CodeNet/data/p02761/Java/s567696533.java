import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
		int [] in = new int [b];
        int [] str = new int [b];
        int [] ans = new int [a];
        for(int i=0;i<b;i++){str[i] = sc.nextInt();
                             in[i] = sc.nextInt();
                            }
        for(int i=0;i<a;i++){ans[i] = -1;
                            }
        for(int i=0;i<b;i++){if(ans[str[i]-1]==in[i]||ans[str[i]-1]==-1)
                              {ans[str[i]-1] = in[i];}
                              else{c = -1;}
                             if(a>1 && ans[0]==0){c=-1;}
                             }
		if(c==0){if(a==1) {c=Math.max(0,ans[0]);}
        else{for(int i=0;i<a;i++){if(ans[i]==-1){if(i==0){ans[i]=1;}else{ans[i]=0;}}
                                                                                                        
                                 }
               if(a==2){c=10*ans[0]+ans[1];} else{c=100*ans[0]+10*ans[1]+ans[2];}
            }
                }
        
		System.out.println(c);
	}
}
