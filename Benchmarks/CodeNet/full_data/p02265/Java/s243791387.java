import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Cell{
    /**
     * headを空の実体セルで実現
     */
    Cell prev;
    Cell next;
    int value;

    Cell(){ // head生成用のコンストラクタ
        this.prev = null;
        this.next = null;
    }

    Cell(int val){
        value = val;
        this.prev = null;
        this.next = null;
    }

    void insert(int value){
        Cell newone = new Cell(value);
        if(this.next != null){
            this.next.prev = newone;
            newone.next = this.next;
        }
        newone.prev = this;
        this.next = newone;
    }

    void delete(int value){
        Cell run = this.next;
        while(run != null){
            if(run.value == value){
                run.prev.next = run.next;
                if(run.next != null){
                    run.next.prev = run.prev;
                }
                return;
            }
            run = run.next;
        }
    }

    void deleteFirst(){
        this.next = this.next.next;
        if(this.next != null){
            this.next.prev = this;
        }
    }

    void deleteLast(){
        Cell run = this;
        while(run.next != null){
            run = run.next;
        }
        run.prev.next = null;
        run.prev = null;
    }

    void show(){
        Cell run = this.next;
        if(run == null){
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder();
        while(run != null){
            sb.append(run.value + " ");
            run = run.next;
        }
        System.out.println(sb.deleteCharAt(sb.length()-1));
    }
}

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Cell head = new Cell();

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");

            switch(input[0]){
                case "insert":
                    head.insert(Integer.parseInt(input[1]));
                    break;
                case "delete":
                    head.delete(Integer.parseInt(input[1]));
                    break;
                case "deleteFirst":
                    head.deleteFirst();
                    break;
                case "deleteLast":
                    head.deleteLast();
                    break;
            }
        }

        head.show();
    }
}
