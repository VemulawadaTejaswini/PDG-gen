import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    
    int sum = 0;
	int l[] = new int[line.length()];
    int r[] = new int[line.length()];
    l[line.length()-1] = 0; r[0] = 0;
    
    for(int i = 1; i < line.length(); i++){
      if(line.charAt(i-1) == '<') l[i] = l[i-1] + 1;
      else l[i] = 0;
    }
    for(int i = line.length()-1; i >= 0; i--){
      if(line.charAt(i) == '>') r[i] = r[i+1] + 1;
      else r[i] = 0;
    }
      
    for(int i = 0; i < line.length(); i++) sum += Math.max(l[i], r[i]);
    System.out.println(sum);

  }
}