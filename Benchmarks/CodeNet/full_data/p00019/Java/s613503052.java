/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package march17;

/**
 *
 * @author Daffodil
 */
public class Factorial {

    public static void main(String[] args) {
        int a = 5;
        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact = (fact * i);
        }

        System.out.println("Fact=" + fact);
    }
}