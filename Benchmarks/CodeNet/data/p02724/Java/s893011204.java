
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

        int x = read.nextInt();
        write.println((x/500)*1000+((x%500)/5)*5);
        write.close();
    }

}