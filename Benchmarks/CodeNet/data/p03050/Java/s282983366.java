import java.util.Scanner;

import java.util.InputMismatchException;

import java.io.*;

public class Main {
  public static void main(String args[]) {
    try {
        Scanner scanner = new Scanner(System.in);
        int favorite = scanner.nextInt();
        int sum;
        for(int i=favorite;0<i;i--){
            if((favorite/i) == (favorite%i)){
                sum+=i;
            }
        }
        System.out.println(sum);
      } catch (InputMismatchException e) { 
        System.out.println("整数を入力してください。");
      }
    }

}