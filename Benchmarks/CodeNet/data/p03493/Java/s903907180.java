import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = nextLine();
        int count;
      	for(int i = 0; i < n.length; i++){
        	if(n[i] == "1") count++;
        }
      	System.out.println(count);
    }
}