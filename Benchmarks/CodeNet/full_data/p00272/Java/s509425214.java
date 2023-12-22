import java.util.Scanner;

class Main{
	public void open(){System.out.println("Ｏｐｅｎ");}
	public void close(){System.out.println("Ｃｌｏｓｅ");}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		String state = sc.nextLine();
		
		if(state.equals("1 0 0"))close();
		else if(state.equals("0 1 0"))close();
		else if(state.equals("1 1 0"))open();
		else if(state.equals("0 0 1"))open();
		else if(state.equals("0 0 0"))close();
	}
	public static void main(String[] args){new Main().run();}
}