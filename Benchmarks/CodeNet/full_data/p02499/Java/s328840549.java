import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
int[] alpha = new int[26];
while(true){
String str = br.readLine();
if(str == null)
 break;
for(int i = 0; i < str.length(); i++){
 if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
 alpha[str.charAt(i) - 'A']++;
 else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
 alpha[str.charAt(i) - 'a']++;
}

}
for(int i = 0; i < 26; i++){
 int a = 'a' + i;
 System.out.println((char)a + " : " + alpha[i]);
}
}
}