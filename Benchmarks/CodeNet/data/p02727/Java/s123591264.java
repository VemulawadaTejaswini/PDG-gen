import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
		int e = sc.nextInt();
        int f = 0;
		long [] in = new long [c];
        long [] in2 = new long [d];
        long [] in3 = new long [e];
        for(int i=0;i<c;i++){
                             in[i] = sc.nextLong();
                            }
        for(int i=0;i<d;i++){
                             in2[i] = sc.nextLong();
                            }
        for(int i=0;i<e;i++){
                             in3[i] = sc.nextLong();
                            }
		Arrays.sort(in);
        Arrays.sort(in2);
        Arrays.sort(in3);
        int g = e-1; 
        int h = c-a; 
        int k = d-b;
        long l;
        while(f==0 && g<=0){if(in[h]<in2[k]){l=in[h];
                                   if(in3[g]>l){in[h]=in3[g];
                                               g--;if(h<c-1){h++;}
                                               else{in[h]=in3[e-1]+1;}
                                               }else{f++;}
                                           }
                           else{l=in2[k];
                               if(in3[g]>l){in2[k]=in3[g];
                                           g--;if(k<d-1){k++;}
                                           else{in2[k]=in3[e-1]+1;}
                                           }else{f++;}
                               }
                          }                           
        long ans = 0;
        for(int i=c-a;i<c;i++){ans+=in[i];}
        for(int i=d-b;i<d;i++){ans+=in2[i];}  
		System.out.println(ans);
	}
}
