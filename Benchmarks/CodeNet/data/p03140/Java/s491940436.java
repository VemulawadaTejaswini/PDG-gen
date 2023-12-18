class Main{
    public static void main(String args[]){
         int total=0;
         for(int i=0;i<args[0].length();i++){
             if(args[0].charAt(i)==args[1].charAt(i)==args[2].charAt(i))
                   continue;
             else if(args[0].charAt(i)==args[1].charAt(i) || 
                       args[0].charAt(i)==args[2].charAt(i) ||
                       args[1].charAt(i)==args[2].charAt(i))
                  total++;
            else
                 total+=2;
            System.out.println(total);
}
