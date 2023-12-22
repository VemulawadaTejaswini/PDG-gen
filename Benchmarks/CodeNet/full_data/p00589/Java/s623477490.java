import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
        Scanner scan = new Scanner(System.in);
        String[] dic = new String[10];
        dic[0] = " ";
        dic[1] = "',.!?";
        dic[2] = "abcABC";
        dic[3] = "defDEF";
        dic[4] = "ghiGHI";
        dic[5] = "jklJKL";
        dic[6] = "mnoMNO";
        dic[7] = "pqrsPQRS";
        dic[8] = "tuvTUV";
        dic[9] = "wxyzWXYZ";
        while(scan.hasNext()){
            String op = scan.nextLine();
            String ans = "";
            int t = 0;
            int prev = -1;
            int count = -1;
            for(int i = 0;i < op.length();i++){
            	t = op.charAt(i) - '0';
            	if(t == prev){
            		count++;
            	}else{
            		if(count >= 0 && prev == 0){
            			for(int j = 0;j < count;j++){
            				ans += " ";
            			}
            		}else if(count >= 0){
            			ans += dic[prev].charAt(count%dic[prev].length());
            		}
            		count = 0;
            		prev = t;
            	}
            }
            if(t != 0){
            	ans += dic[prev].charAt(count%dic[prev].length());
            }
            System.out.println(ans);
        }
    }
}