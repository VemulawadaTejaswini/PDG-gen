import java.util.*;
 
public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] counter=new int[26];
        char[] chars;
        char[] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String sentence="";
        
        while((sentence=scan.nextLine())!=null){
            chars=sentence.toCharArray();
            
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='a'||chars[i]=='A'){
                    counter[0]++;
                }else
                if(chars[i]=='b'||chars[i]=='B'){
                    counter[1]++;
                }else
                if(chars[i]=='c'||chars[i]=='C'){
                    counter[2]++;
                }else
                if(chars[i]=='d'||chars[i]=='D'){
                    counter[3]++;
                }else
                if(chars[i]=='e'||chars[i]=='E'){
                    counter[4]++;
                }else
                if(chars[i]=='f'||chars[i]=='F'){
                    counter[5]++;
                }else
                if(chars[i]=='g'||chars[i]=='G'){
                    counter[6]++;
                }else
                if(chars[i]=='h'||chars[i]=='H'){
                    counter[7]++;
                }else
                if(chars[i]=='i'||chars[i]=='I'){
                    counter[8]++;
                }else
                if(chars[i]=='j'||chars[i]=='J'){
                    counter[9]++;
                }else
                if(chars[i]=='k'||chars[i]=='K'){
                    counter[10]++;
                }else
                if(chars[i]=='l'||chars[i]=='L'){
                    counter[11]++;
                }else
                if(chars[i]=='m'||chars[i]=='M'){
                    counter[12]++;
                }else
                if(chars[i]=='n'||chars[i]=='N'){
                    counter[13]++;
                }else 
                if(chars[i]=='o'||chars[i]=='O'){
                    counter[14]++;
                }else
                if(chars[i]=='p'||chars[i]=='P'){
                    counter[15]++;
                }else
                if(chars[i]=='q'||chars[i]=='Q'){
                    counter[16]++;
                }else
                if(chars[i]=='r'||chars[i]=='R'){
                    counter[17]++;
                }else
                if(chars[i]=='s'||chars[i]=='S'){
                    counter[18]++;
                }else
                if(chars[i]=='t'||chars[i]=='T'){
                    counter[19]++;
                }else
                if(chars[i]=='u'||chars[i]=='U'){
                    counter[20]++;
                }else
                if(chars[i]=='v'||chars[i]=='V'){
                    counter[21]++;
                }else   
                if(chars[i]=='w'||chars[i]=='W'){
                    counter[22]++;
                }else
                if(chars[i]=='x'||chars[i]=='X'){
                    counter[23]++;
                }else
                if(chars[i]=='y'||chars[i]=='Y'){
                    counter[24]++;
                }else
                if(chars[i]=='z'||chars[i]=='Z'){
                    counter[25]++;
                }  
            }
            
        }
        
        for(int i=0;i<alpha.length;i++){
            System.out.println(alpha[i]+":"+counter[i]);
        }
        
    }
}