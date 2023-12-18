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
          nam[i] = ond-((sc.nextInt()/1000)*6);
          System.out.println(nam[i]);
        }
      
      for(int i=1;i<=kosu;i++){
        x = Math.abs(nam[i]-base);
			if(x < z) {
				z = x;
				ans = i;
			}
      }

        System.out.println(ans);
    }
}