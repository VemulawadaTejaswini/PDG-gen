public class Hello{
    public static void Main(){
        var str = System.Console.ReadLine();
        if(str.Length==3){
            for(int i=2; i>=0; i--){
                System.Console.Write(str[i]);
            }
            System.Console.Write("\n");
        }else{
            System.Console.WriteLine(str);
        }
    }
}
