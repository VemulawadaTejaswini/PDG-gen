import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        LinkedList<Integer> linkedList=new LinkedList();
        for(int i=0;i<N;i++){
            Command command=Command.recognize(scanner.next());
            if(command==Command.Insert){
                linkedList.addFirst((Integer)scanner.nextInt());
            }else if(command==Command.Delete){
                linkedList.remove((Integer)scanner.nextInt());
            }else if(command==Command.DeleteFirst){
                linkedList.remove(0);
            }else{
                linkedList.remove(linkedList.size()-1);
            }
        }
        for(int i=0;i<linkedList.size()-1;i++){
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println(linkedList.get(linkedList.size()-1));
    }
    
    private enum Command{
        Insert("insert"),
        Delete("delete"),
        DeleteFirst("deleteFirst"),
        DeleteLast("deleteLast");
        public final String name;
        private Command(String name){
            this.name=name;
        }
        public static Command recognize(String name){
            if(name.equals(Insert.name)){
                return Insert;
            }else if(name.equals(Delete.name)){
                return Delete;
            }else if(name.equals(DeleteFirst.name)){
                return DeleteFirst;
            }else{
                return DeleteLast;
            }
        }
    }
}

