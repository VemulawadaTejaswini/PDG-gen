import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author i.mekni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);

        PrintWriter write = new PrintWriter(System.out);

        String t = read.nextLine();
        if(t.charAt(2)==t.charAt(3) && t.charAt(4)==t.charAt(5)) write.println("Yes");
        else  write.println("No");
        write.close();
    }

}
