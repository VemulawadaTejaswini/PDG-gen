import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();


			System.out.println(keta(r, c, 1,1));


      
    }
    public static long calc(long a,long b){
      System.out.println(factorial(a)+" "+factorial(b));
      return factorial(a+b)/(factorial(a)*factorial(b));
    }

		public static int keta(int a, int b, int c,int i){

			c = c*b;
			if(c > a){
				return i;
			}
			return keta(a,b,c,i+1);
		}

    public static long factorial(long n){
      if(n == 0){
        return new Long(1);
       }
       System.out.println(n * factorial(n-1));

      return n * factorial(n-1);
    }
}
