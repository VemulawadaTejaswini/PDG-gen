import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        char[] s = scan.nextLine().toCharArray();
        int x = scan.nextInt();
        int y = scan.nextInt();

        int ix = 0;
        int iy = 0;
        int r = 0;
        for(char c : s){
            if(c =='F'){
                switch(r){
                    case 0: ix++;
                    break;
                    case 1: iy++;
                    break;
                    case 2: ix--;
                    break;
                    case 3: iy--;
                    break;
                }
            }else{
                if(r%2==0){
                    if(iy > y) r = 3;
                    else r = 1;
                }else{
                    if(ix > x) r = 2;
                    else r = 0;
                }
            }
        }

        if(x == ix && y == iy){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        scan.close();
        
    }
}