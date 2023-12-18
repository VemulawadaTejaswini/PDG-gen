import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int sb = scan.nextInt();
        int tb = scan.nextInt();
        String u = scan.next();
        scan.close();

        if(s.equals(u)) sb--;
        else if(t.equals(u)) tb--;

        System.out.println(sb + " " + tb);
    }
}