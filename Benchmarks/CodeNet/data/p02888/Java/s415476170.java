import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        long b = 0;
        int c = 0;
        int d = 2;
        int e;
		int [] in = new long [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
		Arrays.sort(in);      
        for(int i=0;i<j;i++){for(int j=1;j<k;j++){if(in[j+1]<in[i]+in[j]{c=0;d=4;
                                                                         (while c==0){e = (a+j)/2;
                                                                     if(e<a-1){if(in[e-1]<in[i]+in[j] && in[e]>=in[i]+in[j]){b+=e-j;c++;}
                                                                      else{if(in[e]<in[i]+in[j]){e+=(a+j)/d;d*=2;}
                                                                          else{e-=(a+j)/d;d*=2;}
                                                                          }
                                                                              }
                                                                      else{b+=e-j;}
                                                                                             }
                                                                        }
                                                 }
                            }                                                                     
		System.out.println(b);
	}
}
