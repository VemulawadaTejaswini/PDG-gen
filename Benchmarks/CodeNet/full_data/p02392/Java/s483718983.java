import java.io.* ;

class Main{
    public static void main(String[] a){
    try{
        BufferedReader reader = new BufferedReader reader(new InputStreamReader(System.in));
        String str = reader.readline();
        String pp  = str.split(" ");
        int a = Interger.paraseInt(pp[0]);
        int b = Interger.paraseInt(pp[1]);
        int c = Interger.paraseInt(pp[2]);
        if(a<b && b<c){
           System.out.println("YES");          
}else
System.out.println("NO");
    }catch(IOException);
   e.printStackTrace();
}
}
}