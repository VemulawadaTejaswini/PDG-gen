import java.util.*;
class Main {
  public static void main(String[] args){
    System.out.println(Tile());
  }
  public static int Tile() {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    	if(str.length() == 1) return 0;
  
    String tmp = str.substring(0,1);
    int result = 0;
    for(int i= 1; i < str.length(); i++){
    	if(tmp.equals(str.substring(i, i+1))){
        	result++;
            tmp = tmp.equals("0") ? "1" : "0";
        }else{
        	tmp = str.substring(i, i+1);
        }
    }
    return result;
  }
}