import java.util.*;

public class Main{
	void yes(){
		System.out.println("yes");
	}

	void no(){
		System.out.println("no");
	}

	public void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			String s = scan.nextLine();
			if(s.equals(".")) break;
			Deque<Integer> stack = new ArrayDeque<Integer>();
			String[] sArray = new String[s.length()];
			for (int i = 0; i < s.length(); i++) {
    			// ??????????????????????´???????
    			sArray[i] = String.valueOf(s.charAt(i));
			}
			/*
			for (int i = 0; i < sArray.length; i++) {
    			// "sArray"???1??????????????¨???
    			System.out.println("strArray???????´???????" + i + "?????????" + sArray[i]);
			}
			*/
			//System.out.println("0");
			for (int i=0;i<sArray.length;i++) {
    			if(sArray[i].equals("(")) stack.push(1);
    			if(sArray[i].equals("[")) stack.push(2);
    			//System.out.print("0");
    			if(sArray[i].equals(")")) {
    				Integer a = stack.poll();
    				if(a == null || a == 2) {
    					no();
    					break;
    				}
    			}
    			if(sArray[i].equals("]")){
    				Integer a = stack.poll();
    				if(a == null || a == 1){
						no();
    					break;
    				}
    			}
    			if(sArray[i].equals(".")){
    				if(stack.size() == 0) yes();
    				else no();
    			}
			}
        }
	}

    public static void main(String[] args){
                Main  app = new Main();
		app.run();
    }
}