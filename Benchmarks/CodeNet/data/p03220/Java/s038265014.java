import java.util.*;

class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int kosu = sc.nextInt();
        int ond = sc.nextInt();
        int base = sc.nextInt();
      	int nam[] = new int[kosu];
      	int x = 0;
      	int y = 0;
        int z = 0;
         
        for(int i=0;i<kosu;i++){
          nam[i] = ond-((sc.nextInt()/1000)*6);
        }
      
      for(int i=0;i<kosu-1;i++){
        x = Math.abs(nam[i]-base);
        y = Math.abs(nam[i+1]-base);
        if(x<y){z = i;}
        else if(x>y){z = i+1;}
      }

        System.out.println(z+1);
    }
}