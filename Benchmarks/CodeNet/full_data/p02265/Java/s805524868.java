import java.util.Scanner;

class Node
{
	int key;
	Node prev, next;

	Node()
	{
		key = -1;
		prev = next = null;
	}
}

class DoublyLinkedList
{
	Node nil;
	int N;

	DoublyLinkedList()
	{
		nil = new Node();
		nil.next = nil;
		nil.prev = nil;
		N = 0;
	}

	//先頭に挿入
	void insertNode(Node t, int val)
	{
		Node x = new Node();
		x.key = val;
		x.next = t.next;
		t.next.prev = x;
		x.prev = t;
		t.next = x;
		N++;
	}

	void insertFirst(int val)
	{
		insertNode(nil, val);
	}

	void insertLast(int val)
	{
		insertNode(nil.prev, val);
	}

	void deleteNode(Node t)
	{
		if (t == nil)
		{
			return;
		}
		t.prev.next = t.next;
		t.next.prev = t.prev;
		N--;
	}

	void deleteFirst()
	{
		deleteNode(nil.next);
	}

	void deleteLast()
	{
		deleteNode(nil.prev);
	}

	Node searchKey(int key)
	{
		Node cur = nil.next;
		while (cur != nil && cur.key != key)
		{
			cur = cur.next;
		}
		return cur;
	}

	void deleteKey(int key)
	{
		deleteNode(searchKey(key));
	}

	void print()
	{
		for (Node cur = nil.next; cur != nil; cur = cur.next)
		{
			if (cur != nil.next)
			{
				System.out.print(" ");
			}
			System.out.print(cur.key);
		}
		System.out.println();
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		DoublyLinkedList L = new DoublyLinkedList();
		int n = in.nextInt();
		for (int i = 0; i < n; ++i)
		{
			String com = in.next();
			if (com.equals("deleteFirst"))
			{
				L.deleteFirst();
			} else if (com.equals("deleteLast"))
			{
				L.deleteLast();
			} else if (com.equals("insert"))
			{
				L.insertFirst(in.nextInt());
			} else if (com.equals("delete"))
			{
				L.deleteKey(in.nextInt());
			}
		}
		L.print();
		in.close();
	}
}

