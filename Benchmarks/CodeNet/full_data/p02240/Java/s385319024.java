import java.util.*;
 class ID{
    public int id;
    public ID(int id){
        this.id = id;
    }
}
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ID nullID = new ID(-1);
        ID[] group = new ID[scanner.nextInt()];
        for(int i=0; i<group.length;i++)
            group[i] = nullID;

        int m = scanner.nextInt();
        ArrayList<ID> idList = new ArrayList<ID>();
        int groupID = 0;
        for (int i = 0; i < m; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            if(group[s].id==-1 && group[t].id==-1){
                idList.add(new ID(groupID));
                group[s]=group[t]= idList.get(groupID++);
            }else if(group[s].id!=-1 && group[t].id==-1)
                group[t]=group[s];
            else if(group[s].id==-1 && group[t].id!=-1)
                group[s]=group[t];
            else
                for(int k=0; k<idList.size();k++)
                    if(idList.get(k).id==group[s].id)
                        idList.get(k).id = group[t].id;
        }
/*         for(int k=0; k<group.length ;k++)
             System.out.print(group[k].id+" ");
         System.out.println("");*/
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            if (group[s].id == group[t].id && group[s].id!=-1)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
 

}