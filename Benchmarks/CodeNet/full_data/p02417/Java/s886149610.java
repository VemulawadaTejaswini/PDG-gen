import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

          int x[] = new int[26];
          String str2 = "abcdefghijklmnopqrstuvwxyz";

          while(scan.hasNext()){
             String str = scan.nextLine();

                for(int i =0;i< str.length();i++){

                   int c=str.charAt(i);

                   if('A'<=c&&c<='Z'){
                      c-='A'-'a';
                   }

                   for(int h='a';h<='z';h++){

                      if(h==c){
                         x[h-'a']++;
                      }
                   }
                }
          }

          for(int j=0;j<26;j++){

             String str3 = str2.substring(j,j+1);
             System.out.println(str3+" "+":"+" "+x[j]);

          }

      }
   }
