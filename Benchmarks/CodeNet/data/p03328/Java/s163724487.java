    import java.util.Scanner;
     
    public class Main{
        public static void main (String[] args){
             Scanner input = new Scanner(System.in);
           
             while(input.hasNext()){
                  int a = input.nextInt();
                  int b = input.nextInt();
                  int towerID = b - a;
                  int bHeight = ((towerID + 1) * towerID) / 2;
                  int x = bHeight - b;
                  
                  System.out,.println(x);
             }
        }
    }