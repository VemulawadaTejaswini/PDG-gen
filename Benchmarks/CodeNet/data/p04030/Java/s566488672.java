public class Main {
        
    public static void main(String Args[]){                       
        
       Scanner sc=new Scanner(System.in);
          
       String str = sc.next();
       
       StringBuffer sb1 = new StringBuffer();
       
       char []hoge = str.toCharArray();
       
       for(char ch:hoge){
           if(ch == '0'){
              sb1.append(0);
           }
           if(ch == '1'){
              sb1.append(1);
           }
           if(ch == 'B'){
               if(sb1.length() > 0){
                  sb1.delete(sb1.length()-1,sb1.length());
               }
           }   
       }                            
       
       
       System.out.println(sb1);
    }

}