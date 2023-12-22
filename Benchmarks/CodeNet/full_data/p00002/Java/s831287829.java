import java.util.Scanner;;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	try {
			while(scan.hasNextInt()){
				System.out.println(Integer.toString(scan.nextInt() + scan.nextInt()).length());
			}
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
		}
    }
}