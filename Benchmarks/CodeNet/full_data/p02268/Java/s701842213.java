import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // 探索先データを入力
    int data_number = Integer.parseInt(scan.next());
    int data[] = new int[data_number];
    for (int i = 0; i < data_number; i++) {
      data[i] = Integer.parseInt(scan.next());
    }
    // 探索データを入力
    int search_key_number  = Integer.parseInt(scan.next());
    int search_key[] = new int[search_key_number];
    for (int i = 0; i < search_key_number; i++) {
      search_key[i] = Integer.parseInt(scan.next());
    }
    // 探索を開始
    int count = 0;
    for (int i = 0; i < search_key_number; i++) {
      if (BinarySearch(search_key[i], data, data_number) != -1) {
        count++;
      }
    }

    System.out.println(count);
  }

  private static int BinarySearch(int search_key, int data[], int data_number) {
    int left = 0, right = data_number, mid = 0;

    while (left < right) {
      mid = (left + right) / 2;
      if (data[mid] < search_key) {
        left = mid + 1;
      } else if (search_key < data[mid]) {
        right = mid;
      } else {
        return mid;
      }
    }

    return -1;
  }
}

