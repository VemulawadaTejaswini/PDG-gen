import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	
      	String str = sc.next();
      	String str1 = str.substring(0, 1);
      	String str2 = str.substring(1, 2);
      	String str3 = str.substring(2, 3);
      	int count = 0;
      
      	if(str1.equals("R")) {
          	count++;
        	if(str2.equals("R")) {
            	count++;
	        	if(str3.equals("R")) {
                  count++;
                }
            }
        } else {
        	if(str2.equals("R")) {
            	count++;
	        	if(str3.equals("R")) {
                  count++;
                }
            }
        }
      	System.out.println(count);
      	sc.close();
    }
}