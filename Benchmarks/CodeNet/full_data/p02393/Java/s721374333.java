import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String number= input.nextLine();
		String []numbers=number.split(" ");
	    int number1=Integer.parseInt(numbers[0]);
	    int number2=Integer.parseInt(numbers[1]);
	    int number3=Integer.parseInt(numbers[2]);
	    if(number1>=1&&number1<=10000&&number2>=1&&number2<=10000&&number3>=1&&number3<=10000) {
	    if ((number1>number2 &&number1>number3))
        {if(number2>number3){
                System.out.print(number3 + " " + number2 + " " + number1);
            }else System.out.print(number2 + " " + number3 + " " + number1);}
        else if ((number2>number1&&number2 >number3)){
            if(number1> number3){
                System.out.print(number3 + " " + number1 + " " + number1);}
            else{
                System.out.print(number1 + " " + number3 + " " + number2);
                }}
        else if ((number3 > number1 && number3 > number2)){
            if(number1 > number2){
                System.out.print(number2 + " " + number1 + " " + number3); }
            else
                System.out.print(number1 + " " + number2 + " " + number3);
            }
	    }
	    }
	}