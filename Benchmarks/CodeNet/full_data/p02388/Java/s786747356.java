public class Main{
    public static void main(String[] args){

    String value;
    int input;
    int output;

    System.out.println("test");
    value = new java.util.Scanner(System.in).nextLine();
    input=Integer.parseInt(value);
    output=(int)(Math.pow((double)input,3));
    System.out.println(output);
    }
}