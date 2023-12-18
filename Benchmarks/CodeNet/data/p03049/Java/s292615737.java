import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        String[] line = new String[num];
        String[][] s = new String[num][10];
        for(int i=0; i<num; i++){
          line[i] = sc.next();
          s[i] = line[i].split("");
        }
        int count = 0;
        int aNum = 0;
        int bNum = 0;
        int baNum= 0;
        int check = 0;
        for(int i=0; i<num; i++){
          for(int j=0; j<line[i].length()-1; j++){
            if(s[i][j].equals("A") && s[i][j+1].equals("B")) count++;
            if(j == 0 && s[i][j].equals("B")) {
              bNum++;
              check = 1;
            }
            if(j == line[i].length()-2 && s[i][j+1].equals("A")) {
              if(check == 1){
                baNum++;
                aNum++;
              }
              else aNum++;
            }
          }
          check = 0;
        }
        int plus = (aNum <= bNum) ? aNum : bNum;
        //if(aNum == num && bNum == num) plus--;
        if(baNum > 0 && baNum == aNum && baNum == bNum) plus -= 1;
		System.out.println(count+plus);
        //System.out.println(aNum);
        //System.out.println(bNum);
	}
}