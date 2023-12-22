import java.util.*;  
class  Main{
   public static void main(String[] args){
   	
   	Scanner input = new Scanner(System.in);
   	int n = input.nextInt();//入力文字数決定
   
        // 文字列を List へ追加
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
        	String s = input.next();
            list.add(s);
        	for(int j = 0; j > n-1; j++);
        	list.add(" ");
        }
   		list.toString();

        // 昇順にソート
        Collections.reverse(list);

        // List の文字列を StringBuilder に追加
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
   	System.out.println(sb.toString());
   }
}