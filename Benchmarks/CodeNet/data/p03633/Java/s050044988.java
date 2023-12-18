import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        int b = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
        Arrays.sort(in);
		long ans = 0;
        while(b==0){ans+=in[a-1];
        for(int i=a;i>0;i--){if(ans%in[i-1]==0){if(i==1){b++;}
                                             }else{break;}
                            }                                                    
                   }       
		System.out.println(ans);
	}
}
