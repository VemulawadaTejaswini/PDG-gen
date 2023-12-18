    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int N = sc.nextInt();
    		int M = sc.nextInt();

            int[] a = new int[N];
            int[] b = new int[N];
            
            int[] amin = new int[N];
            int[] bmin = new int[N];

            amin[0]=0;
            bmin[0]=0;

            
            for(int i=0; i<N; i++){
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();

                if(i==0){
                    amin[0]=a[0];
                    bmin[0]=a[0];

                }else{
                
                    for(int j=0; j<i; j++){

                        if(a[i]<amin[j]){
                            for(int n=i; n>j; n--){
                                amin[n]=amin[n-1];
                                bmin[n]=bmin[n-1];
                            }
                            amin[j]=a[i];
                            bmin[j]=b[i];
                        }else{
                            amin[i]=a[i];
                            bmin[i]=b[i];
                        }
                    }
                }
            }


            
            
            int pr = 0;
            int prlast =0;
            int num=0;
            int numlast=0;

            for(int i = 0; i<N; i++){
                num = num + amin[i];
                pr = pr + amin[i] * bmin[i];

                if(num>M){
                    break;
                }
                numlast=num;
                prlast=bmin[i];

            }

            int n = M-numlast;
            int rslt= pr-n*prlast;



                
    		// 出力
    		System.out.println(rslt);
    	}
    }
