import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();                                                                         //半径r
        System.out.println(String.format("%.6f",r*r*Math.PI)+" "+String.format("%.6f",2*r*Math.PI));        //print(面積 円周の長さ)
    }
}
