import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = new String();
            int i =0 ;
            while(in.hasNext()) {
                        String buf = in.nextLine();                                     
                    i++;
                    str = str + buf;
                    System.out.println("Case" + " " + i  + " " + ":" + buf);
                    }
           // System.out.println("Case" + " " + i + ":" + buf);
           // System.out.println(str);
        }
}