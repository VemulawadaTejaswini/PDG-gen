import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           
             String Key = sc.next();
        		Key = Key.toUpperCase();
        int sum =0;
        while( true ){
            String T = sc.next();
            if( T.equals( "END_OF_TEXT" ) )
                break;
				T = T.toUpperCase();
            	if(Key.equals(T))
                    sum++;
        }
        System.out.println(sum);
        sc.close();
    }
}
