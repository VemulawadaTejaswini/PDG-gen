import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static class Data {
		private String key;
		private Data nextData;
		private Data prevData;

		public Data (String key) {
			this.key = key;
			this.nextData = null;
			this.prevData = null;
		}

		public String getKey() {
			return this.key;
		}

		public void setNext(Data nextData) {
			this.nextData = nextData;
		}

		public void setPrev(Data prevData) {
			this.prevData = prevData;
		}

		public Data getNext() {
			return this.nextData;
		}

		public Data getPrev() {
			return this.prevData;
		}
	}

	public static class List {
		private Data first;
		private Data last;

		public List() {
			this.first = null;
			this.last = null;
		}

		public void insert(String key) {
			Data data = new Data(key);

			if(this.first == null && this.last == null) {
				this.first = data;
				this.last = data;
			} else {
				this.first.setPrev(data);
				data.setNext(this.first);
				this.first = data;
			}
		}

		public void delete(String key) {
			Data data = this.first;

			while(data != null) {
				String dataKey = data.getKey();
				if(dataKey.equals(key)) {
					// Key????????´????????¨????????????????????????

					if(data.getPrev() == null) {
						this.first = data.getNext();
						this.first.setPrev(null);
					}

					if(data.getNext() == null) {
						this.last = data.getPrev();
						this.last.setNext(null);
					}

					if(!(data.getPrev() == null) && !(data.getNext() == null)) {
						data.getNext().setPrev(data.getPrev());
						data.getPrev().setNext(data.getNext());
					}

					break;
				}
				data = data.getNext();
			}
		}

		public void deleteFirst() {
			if(this.first.getNext() == null) {
				this.first = null;
				this.last = null;
			} else {
				this.first = this.first.getNext();
				this.first.setPrev(null);
			}
		}

		public void deleteLast() {
			if(this.last.getPrev() == null) {
				this.first = null;
				this.last = null;
			} else {
				this.last = this.last.getPrev();
				this.last.setNext(null);
			}
		}

		public void printData() {
			Data data = this.first;

			while(data != null) {
				System.out.print(data.getKey());

				if(!(data.getNext() == null)) {
					System.out.print(" ");
				}
				data = data.getNext();
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List list = new List();

		int orderNumOfTimes = Integer.parseInt(br.readLine());

		for (int i = 0; i < orderNumOfTimes; i++) {
			String[] order = br.readLine().split(" ");

			if(order[0].equals("insert")) {
				list.insert(order[1]);
			}
			else if(order[0].equals("delete")) {
				list.delete(order[1]);
			}
			else if(order[0].equals("deleteFirst")) {
				list.deleteFirst();
			}
			else if(order[0].equals("deleteLast")) {
				list.deleteLast();
			}
		}
		list.printData();
	}
}