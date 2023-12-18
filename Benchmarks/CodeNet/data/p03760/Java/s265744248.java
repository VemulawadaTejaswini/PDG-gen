import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String[] Odd=sc.next().split("");
    	String[] Even=sc.next().split("");

    	int length=Odd.length+Even.length;

    	StringBuilder result=new StringBuilder();

    	for(int i=0;i<Odd.length;i++) {
    		result.append(Odd[i]);

    		if(i<Even.length) {
    			result.append(Even[i]);
    		}
    	}
    	System.out.println(result.toString());
    }

}

