import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int S = sc.nextInt();
            int S1 = S % 3600;
            int se = S1 % 60;
            int m = (S1 - se)/60;
            int h = (S - S1)/3600;
             
            System.out.println( h + ":" + m +":" + se);
        }
    }
}