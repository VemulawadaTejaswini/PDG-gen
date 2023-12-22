import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();		
        String [] str = new String [h];
        for(int i=0;i<h;i++){str[i] = sc.next();
                            }
        int ans = 0;
        int [] retu = new int [w];
        int [] gyou = new int [h];
        int r = 1;
        int g = 1;
        for(int i=0;i<w;i++){r*=2;}
        for(int i=0;i<h;i++){g*=2;}
        for(int l=0;l<r;l++){int l1 = l;
                             for(int m=0;m<w;m++){retu[m]=l1%2;l1/=2;}
                             for(int m=0;m<g;m++){int m1 = m;
                             for(int n=0;n<h;n++){gyou[n]=m1%2;m1/=2;} 
        int count = 0;
        for(int i=0;i<h;i++){
                             for(int j=0;j<w;j++){if(retu[j]==0 && gyou[i]==0 && str[i].charAt(j)=='#'){count++;}
                                                 }
                             
                            }if(count==k){ans++;}
        }                       
        }
		System.out.println(ans);
	}
}