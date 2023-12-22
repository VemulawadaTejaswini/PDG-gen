import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        if(x+r<=W&&x-r>=0&&y+r<=H&&y-r>=0&&x>=0&&y>=0){System.out.println("Yes");}
        else if(x+r>W){System.out.println("No");}
        else if(y+r>H){System.out.println("No");}
        else if(x+r<0){System.out.println("No");}
        else if(y<0){System.out.println("No");}
        else if(x<0){System.out.println("No");}
        }
    }