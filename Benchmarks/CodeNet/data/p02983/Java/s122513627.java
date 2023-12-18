import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      	long nam1 = sc.nextInt()%1000000007;
      	long nam2 = sc.nextInt()%1000000007;;
      
      if(nam1<=2019&&nam2>=2019){System.out.println(0);}
      else if(nam2<2019){System.out.println((nam2*(nam2-1))%2019);}
      else if(nam1>2019){System.out.println((nam1*(nam1+1))%2019);}

    }
}