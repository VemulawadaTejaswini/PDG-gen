import java.util.*;

class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int kosu = sc.nextInt();
        int ond = sc.nextInt();
        int base = sc.nextInt();
      	int nam[] = new int[kosu+1];
      	int x = 0;
        int z = 10000;
        int ans = 0;
        
         
        for(int i=1;i<=kosu;i++){
          nam[i] = ond-(sc.nextInt()/1000)*6;
        }
      
        for(int i=1;i<=kosu;i++){
            if(base>nam[i]){
             x = Math.abs(base-nam[i]);
            }else if(base<nam[i]){
             x = Math.abs(nam[i]-base); 
            }else{
                x = 0;
            }
			    if(x < z) {
				    z = x;
				    ans = i;
			}
      }

        System.out.println(ans);
    }
}