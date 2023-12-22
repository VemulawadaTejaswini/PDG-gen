import java.util.*;
import java.util.ArrayList;
import java.io.*;

class P2010_Asia_B{
    public static String reverse(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = source.length() - 1; i >= 0; i--)
            dest.append(source.charAt(i));
        return dest.toString();
    }
    private void run() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input, output;
        List<String> menber_list = new ArrayList<String>();
        List<String> menber_list_ = new ArrayList<String>();
        ArrayList<String> key_list = new ArrayList<String>();
        List<String> remove_list = new ArrayList<String>();
        List<String> add_list = new ArrayList<String>();
        List all_list = new ArrayList();
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet_ = new HashSet<String>();
        String[] tmp, tmp_menber;
        String ans,ansbefore;
        LinkedHashMap<String,List<String>> map = new LinkedHashMap<String,List<String>>();
        LinkedHashMap<Integer,String> junban_map = new LinkedHashMap<Integer,String>();
        int key_count = 0;
        int num = 0;
        int count = 0;

        while(true){
            menber_list.clear();
            hashSet.clear();
            key_list.clear();
            num = Integer.parseInt(in.readLine());
            count = 0;
            if(num == 0){
                break;
            }
            for(int i = 0;i < num;i++){
                input = in.readLine();
                menber_list_.clear();
                input = input.substring(0, input.length()-1);
                tmp = input.split(":",0);
                tmp_menber = tmp[1].split(",",0);
                if(count == 0){
                    for(int j = 0;j < tmp_menber.length;j++){
                        menber_list.add(tmp_menber[j]);
                        menber_list_.add(tmp_menber[j]);
                        //System.out.println(tmp_menber[j]+"hello");
                    }
                    key_list.add(tmp[0]);
                    System.out.println("hello: "+menber_list);
                    map.put(tmp[0],menber_list);
                    count++;
                }
                else if(/*menber_list.indexOf(tmp[0]) != -1 &&*/ count != 0){
                    for(int j = 0;j < tmp_menber.length;j++){
                        menber_list.add(tmp_menber[j]);
                        menber_list_.add(tmp_menber[j]);
                        //System.out.println(tmp_menber[j]+"hello");
                    }
                    key_list.add(tmp[0]);
                    map.put(tmp[0],menber_list_);
                    System.out.println("hello: "+menber_list);
                    count++;
                }
            }
            key_count = 0;
            System.out.println("menber:"+menber_list);
            hashSet_.clear();
            add_list.clear();
            hashSet_.addAll(key_list);
            for(String key:key_list){
                if(key_count > 0){
                    System.out.println("current_key:"+key);
                    if(menber_list.indexOf(key) == -1){
                        remove_list = map.get(key);
                        System.out.println("remove_list"+remove_list);
                        if(remove_list.size() != 0){
                            for(String remove_data:remove_list){
                                System.out.println(remove_data);
                                menber_list.remove(remove_data);
                            }
                        }
                        System.out.println(menber_list);
                    }
                    else if(menber_list.indexOf(key) != -1){
                        add_list = map.get(key);
                        System.out.println("add_list:"+add_list);
                        menber_list.remove(key);
                        if(remove_list.size() != 0){
                            for(String add_data:add_list){
                                menber_list.add(add_data);
                            }
                        }
                        System.out.println(menber_list);
                    }
                }
                else if (key_count == 0){
                    key_count++;
                }
            }
            hashSet.addAll(menber_list);
            for(String key_:key_list){
                hashSet.remove(key_);
            }
            System.out.println(hashSet);
            System.out.println(hashSet.size());
        }
    }

    public static void main(String args[]) throws IOException{
        P2010_Asia_B app = new P2010_Asia_B();
        app.run();
    }
}