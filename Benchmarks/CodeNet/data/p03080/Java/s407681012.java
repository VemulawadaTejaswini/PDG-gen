import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String inp = scan.nextLine();

        int red = 0;
        int blue = 0;


        for(int i = 0; i < n; i++){
            if(inp.charAt(i) == 'R'){
                red = red + 1;
            } else {
                blue = blue + 1;
            }
        }
        
        if( red > blue){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        

  
    }